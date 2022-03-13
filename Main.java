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
    System.out.println("5. Choinka ");
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
        choinka();
        break;
      default: 
        System.out.println("Brak opcji");
        break;
      }
    }
  }
  
public static void dodawanie() {
    int one, two, four, suma;
    Scanner sa = new Scanner(System.in);
    System.out.println("Podaj liczbe 1/3: ");
    one = sa.nextInt();

    System.out.println("Podaj liczbe 2/3: ");
    two = sa.nextInt();

    System.out.println("Podaj liczbe 3/3: ");
    four = sa.nextInt();
    suma = one + two + four;
    System.out.println("To " + suma);
  }
  
public static void kalkulator() {
    int dzial;
    float c1, c2, wynik=0;
    Scanner sb = new Scanner(System.in);
    System.out.println("Wybierz dzialanie: ");
    System.out.println("1. Suma ");
    System.out.println("2. Roznica ");
    System.out.println("3. Iloczyn ");
    System.out.println("4. Iloraz ");
    dzial = sb.nextInt();
    if(dzial<1 || dzial>4)
    System.out.println("Nie ma takiej opcji: ");
    else{
    System.out.println("Podaj pierwsza liczbe: ");
    c1 = sb.nextFloat();
    System.out.println("Podaj druga liczbe: ");
    c2 = sb.nextFloat();
    switch (dzial) {
      case 1:
        wynik = c1+c2;
        break;
      case 2:
        wynik = c1-c2;
        break;
      case 3:
        wynik = c1*c2;
        break;
      case 4:
        if(c2==0){
          System.out.println("Nie dzilimy przez 0");
          break;
          }
        else
        wynik = c1/c2;
        break;
      }
      System.out.println("Wynik dzialania: "+wynik);
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

  public static void choinka() {
    int szer=14, lszer=1;
  }
}