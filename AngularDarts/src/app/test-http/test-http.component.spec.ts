import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TestHttpComponent } from './test-http.component';

describe('TestHttpComponent', () => {
  let component: TestHttpComponent;
  let fixture: ComponentFixture<TestHttpComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TestHttpComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TestHttpComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
