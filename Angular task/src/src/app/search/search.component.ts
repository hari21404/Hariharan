import { Component, OnInit } from '@angular/core';
import { MovieService } from '../movie.service';
import { Movie } from '../movie.model';
import { Observable, Subject, of } from 'rxjs';
import { debounceTime, distinctUntilChanged, switchMap, catchError } from 'rxjs/operators';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css'],
  standalone: false
})
export class SearchComponent implements OnInit {
  movies: Movie[] = [];
  searchTerms = new Subject<string>();
  isSearching = false;
  
  constructor(private movieService: MovieService) {}
  
  ngOnInit() {
    this.searchTerms.pipe(
      debounceTime(300),
      distinctUntilChanged(),
      switchMap((term: string) => {
        if (!term.trim()) {
          this.isSearching = false;
          return of([]);
        }
        this.isSearching = true;
        return this.movieService.searchMovies(term).pipe(
          catchError(() => {
            this.isSearching = false;
            return of([]);
          })
        );
      })
    ).subscribe(results => {
      this.movies = results;
      this.isSearching = false;
    });
  }

  search(term: string): void {
    this.searchTerms.next(term);
  }

  getStars(rating: number): number[] {
    return Array(Math.floor(rating)).fill(0);
  }
}