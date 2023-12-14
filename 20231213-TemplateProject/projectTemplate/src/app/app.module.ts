import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { SideNavComponent } from './components/side-nav/side-nav.component';
import { SideNavContentComponent } from './components/side-nav-content/side-nav-content.component';
import { FooterComponent } from './components/footer/footer.component';
import { Proyecto1Component } from './components/proyecto-1/proyecto-1.component';
import { Proyecto2Component } from './components/proyecto-2/proyecto-2.component';
import { HomeComponent } from './components/home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    SideNavComponent,
    SideNavContentComponent,
    FooterComponent,
    Proyecto1Component,
    Proyecto2Component,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
