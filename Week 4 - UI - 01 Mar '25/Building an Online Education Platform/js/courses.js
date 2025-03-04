
const courses = [
    { 
      id: 1, 
      title: "Introduction to Programming", 
      instructor: "John Doe", 
      description: "Learn the basics of programming.", 
      image: "assets/images/course1.jpg"  // Image for this course
    },
    { 
      id: 2, 
      title: "Advanced JavaScript", 
      instructor: "Jane Smith", 
      description: "Master JavaScript with advanced concepts.", 
      image: "assets/images/course2.jpg" 
    },
    { 
      id: 3, 
      title: "Web Development Bootcamp", 
      instructor: "Jake Johnson", 
      description: "A complete guide to becoming a full-stack web developer.", 
      image: "assets/images/course3.jpg" 
    },
    { 
      id: 4, 
      title: "Data Science with Python", 
      instructor: "Sara Lee", 
      description: "Explore data analysis and machine learning with Python.", 
      image: "assets/images/course4.jpg" 
    },
    { 
      id: 5, 
      title: "Machine Learning Basics", 
      instructor: "David Brown", 
      description: "Learn the foundational concepts of machine learning.", 
      image: "assets/images/course5.jpg" 
    }
  ];
  
  
  function displayCourses(filteredCourses) {
    const courseList = document.getElementById("course-list");
    courseList.innerHTML = "";
  
    filteredCourses.forEach(course => {
      const courseDiv = document.createElement("div");
      courseDiv.classList.add("course-item");
  
     
      const courseImage = document.createElement("img");
      courseImage.src = course.image;
      courseImage.alt = `${course.title} image`;
      courseImage.classList.add("course-image");
      courseDiv.appendChild(courseImage);
  
      const courseTitle = document.createElement("h3");
      courseTitle.innerText = course.title;
      courseDiv.appendChild(courseTitle);
  
     
      const courseInstructor = document.createElement("p");
      courseInstructor.innerText = `Instructor: ${course.instructor}`;
      courseDiv.appendChild(courseInstructor);
  
   
      const courseDescription = document.createElement("p");
      courseDescription.innerText = course.description;
      courseDiv.appendChild(courseDescription);
  
     
      courseList.appendChild(courseDiv);
    });
  }
 
  function searchCourses() {
    const searchTerm = document.getElementById("search-bar").value.toLowerCase();
    const filteredCourses = courses.filter(course => {
      return (
        course.title.toLowerCase().includes(searchTerm) ||
        course.instructor.toLowerCase().includes(searchTerm) || 
        course.description.toLowerCase().includes(searchTerm) 
      );
    });
  
    displayCourses(filteredCourses); 
  }
  
  
  displayCourses(courses);
  