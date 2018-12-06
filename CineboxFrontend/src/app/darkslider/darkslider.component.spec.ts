import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DarksliderComponent } from './darkslider.component';

describe('DarksliderComponent', () => {
  let component: DarksliderComponent;
  let fixture: ComponentFixture<DarksliderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DarksliderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DarksliderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
