import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Observable, of } from 'rxjs';
import { catchError } from 'rxjs/operators';

import { Courses } from '../model/courses';
import { CoursesService } from './../services/courses.service';
import { ErrorDialogComponent } from '../../shared/components/error-dialog/error-dialog.component';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.scss']
})
export class CoursesComponent implements OnInit {

  courses$: Observable<Courses[]>;
  displayedColumns = ['name', 'category'];



  constructor(
    private coursesService: CoursesService,
    public dialog: MatDialog
    ) {
    //this.courses

    this.courses$ = this.coursesService.list()
    .pipe(
      catchError (erroe => {
        this.onError('Erro ao carregar cursos.');
        return of([])
      })

    );

    }

    onError(errorMsg: string) {
      this.dialog.open(ErrorDialogComponent, {
        data: errorMsg
      });
    }

  ngOnInit(): void {
    //this.courses = this.coursesService.list();
  }

}
