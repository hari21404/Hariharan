import { Component } from '@angular/core';
import { MovieService } from '../movie.service';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-movie',
  templateUrl: './add-movie.component.html',
  styleUrls: ['./add-movie.component.css'],
  standalone: false
})
export class AddMovieComponent {
  movieForm: FormGroup;
  submitted = false;

  constructor(
    private movieService: MovieService, 
    private router: Router,
    private fb: FormBuilder
  ) {
    this.movieForm = this.fb.group({
      title: ['', Validators.required],
      description: ['', Validators.required],
      imageUrl: ['', Validators.required],
      rating: [5, [Validators.required, Validators.min(1), Validators.max(5)]],
      releaseDate: ['', Validators.required],
      genre: ['', Validators.required]
    });
  }

  onSubmit(): void {
    this.submitted = true;
    if (this.movieForm.invalid) {
      return;
    }

    this.movieService.addMovie(this.movieForm.value)
      .subscribe(() => {
        this.router.navigate(['/']);
      });
  }
}