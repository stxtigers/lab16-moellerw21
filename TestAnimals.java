

public class TestAnimals
{
  public static void main(String[] args){
  Animal[] animals = new Animal[4];
  
  animals[0] = new GreySquirrel(5, 5);
  animals[1] = new Squirrel(5, 5);
  animals[2] = new FlyingSquirrel(5, 5);
  animals[3] = new Sloth(5, 5);
  
  for(int i = 0; i < 4; i++)
  {
    animals[i].move(2);
    System.out.println(animals[i].toString());
  }
  
  
  }
}