import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

import { Courses } from '../model/courses';
import { CoursesService } from './../services/courses.service';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.scss']
})
export class CoursesComponent implements OnInit {

  courses: Observable<Courses[]>;
  displayedColumns = ['name', 'category'];



  constructor(private coursesService: CoursesService) {
    //this.courses

    this.courses = this.coursesService.list();

  }

  ngOnInit(): void {
    //this.courses = this.coursesService.list();
  }

}
