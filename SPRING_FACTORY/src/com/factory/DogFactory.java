package com.factory;

public class DogFactory 
{
  private DogBreed db=new DogBreed();
  public DogFactory() {
	this.db.setBreed("Labaradour");
	this.db.setDogname("pikachu");
	
}
  public DogBreed getInstance()
  {
	  return db;
  }
}
