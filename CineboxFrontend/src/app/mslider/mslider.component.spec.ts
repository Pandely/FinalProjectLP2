import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MsliderComponent } from './mslider.component';

describe('MsliderComponent', () => {
  let component: MsliderComponent;
  let fixture: ComponentFixture<MsliderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MsliderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MsliderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
