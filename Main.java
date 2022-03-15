import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int wybor;
    Scanner s = new Scanner(System.in);
    while (true){
    System.out.println("1. Dodawanie ");
    System.out.println("2. Kalkulator ");
    System.out.println("3. Liczby parzyste ");
    System.out.println("4. Liczba pierwsza ");
    System.out.println("5. Liczby nieparzyste ");
    System.out.println("6. Celsjusz i Fahrenheit ");
    System.out.println("7. Choinka ");
    wybor = s.nextInt();
    switch (wybor) {
      case 1:
        dodawanie();
        break;
      case 2:
        kalkulator();
        break;
      case 3:
        parzyste();
        break;
      case 4:
        pierwsze();
        break;
      case 5:
        nieparzyste();
        break;
      case 6:
        cf();
        break;
      case 7:
        choinka();
      break;
      default: 
        System.out.println("Brak opcji");
        break;
      }
    }
  }
  
public static void dodawanie() {
    int one, two;
    double suma;
    Scanner sa = new Scanner(System.in);
    System.out.println("Podaj liczbe 1/2: ");
    one = sa.nextInt();

    System.out.println("Podaj liczbe 2/2: ");
    two = sa.nextInt();

    suma = Math.sqrt(one) + Math.sqrt(two);
    System.out.println("To " + suma);
  }
  
public static void kalkulator() {
    int dzial;
    double c1=0, c2=0, wynik=0;
    Scanner sb = new Scanner(System.in);
    System.out.println("Wybierz dzialanie: ");
    System.out.println("1. Pole prostokata ");
    System.out.println("2. Suma pol kol ");
    System.out.println("3. Pole trojkata prostokatnego ");
    System.out.println("4. Iloraz ");
    dzial = sb.nextInt();
    if(dzial<1 || dzial>4)
    System.out.println("Nie ma takiej opcji: ");
    else{
    switch (dzial) {
      case 1:
        System.out.println("Podaj pierwszy bok: ");
        c1 = sb.nextDouble();
        System.out.println("Podaj drugi bok: ");
        c2 = sb.nextDouble();
        wynik = c1*c2;
        System.out.println("Pole prostokata: "+wynik);
        break;
      case 2:
        System.out.println("Podaj promien 1: ");
        c1 = sb.nextDouble();
        System.out.println("Podaj promien 2: ");
        c2 = sb.nextDouble();
        wynik = (Math.PI *(c1*c1))+(Math.PI *(c2*c2));
        System.out.println("Suma pol: "+wynik);
      break;
      case 3:
        System.out.println("Podaj bok 1: ");
        c1 = sb.nextDouble();
        System.out.println("Podaj bok 2: ");
        c2 = sb.nextDouble();
        wynik=(c1*c2)/2;
        System.out.println("Pole: "+wynik);
        break;
      case 4:
        System.out.println("Podaj pierwsza liczbe: ");
        c1 = sb.nextDouble();
        System.out.println("Podaj druga liczbe: ");
        c2 = sb.nextDouble();
        if(c2==0){
          System.out.println("Nie dzilimy przez 0");
          break;
          }
        else
        wynik = c1/c2;
        System.out.println("Wynik dzielenia: "+wynik);
        break;
      }
    }
  }

  public static void parzyste() {
    int lcz;
    Scanner sc = new Scanner(System.in);
    System.out.println("Podaj liczbe do sprawdzenia: ");
    lcz = sc.nextInt();
    if(lcz %2 == 0)
      System.out.println("Liczba parzysta");
    else
      System.out.println("Liczba nieparzysta");
  }

  public static void pierwsze() {
    int prw, l=0;
    double sqprw;
    Scanner sd = new Scanner(System.in);
    System.out.println("Podaj liczbe do sprawdzenia: ");
    prw = sd.nextInt();
    if(prw>3){
    sqprw = Math.sqrt(prw);
    for(int i=2;i<sqprw;i++){
      if(prw%i==0){
        l++;
        break;
      }
    }
      if(l!=0)
        System.out.println("To nie jest liczba pierwsza ");
      else
        System.out.println("To jest liczba pierwsza ");
      }
    else
      System.out.println("To nie jest liczba pierwsza ");
  }

  public static void nieparzyste() {
      int j=50;
      while(j<101){
      if(j %2 == 0)
        j++;
      else{
        System.out.println("Liczba nieparzysta: "+j);
        j++;
        }
      }
  }
  
  public static void cf() {
    int cel=0;
    float fah;
    while(cel!=320){
      fah=32+((cel*9)/5);
      System.out.println(+cel+"C = "+fah+"F");
      cel+=20;
    }
  }

  public static void choinka() {
    Scanner sb = new Scanner(System.in);
    int wys, szer;
    do{
    System.out.println("Podaj wartosci wieksze niz 0");
    System.out.println("Podaj wysokosc: ");
    wys = sb.nextInt();
    System.out.println("Podaj szerokosc: ");
    szer = sb.nextInt();
      }while(szer==0 || wys==0);
    char[][] choinka = new char[wys][szer];
    for ()
  }
}