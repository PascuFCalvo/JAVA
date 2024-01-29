import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args){
        System.out.println("Hola mundo");

        // se comenta como en javascript

        String myString = "Esto es una cadena de texto";
        myString = "le cambiamos el valor";

        System.out.println(myString);

        Integer myInt = 7;
        myInt = myInt + 4;

        System.out.println(myInt -1);

        Double myDouble = 6.0 ;
        Double myDouble2 = 6d;

        //Float, long, byte ...

        Float myFloat = 6.0f;

        //casi que puedes sumar / concatenar casi cuaquier cosa
        System.out.println(myDouble2 + myFloat + myInt + " " + myString);

        Boolean myBoolean = true;

        System.out.println(myBoolean);

        myBoolean = null;

        System.out.println(myBoolean);

        //salvar null pointer exception

        if (myFloat != null){
            System.out.println(myFloat + 10);
            System.out.println("my Float no es nulo");
        } else {
            System.out.println("my Float es nulo");
        }

        if (myInt == 10){
            System.out.println("my Float no es 10");
        } else if(myInt == 12){
            System.out.println("my Float no es ni 10 ni 12");
        } else if (myInt == 11) {
            System.out.println("my Float es 11");
        } else {
            System.out.println("my Float no es ninguno de esos valores");
        }

        //aqui lo inicializas pero no le puedes añadir datos de primeras
        List myArray = new ArrayList();
        //ahora e añadimos datos y empezamos a trabajar
        myArray.add(myString);
        myArray.add(myInt);
        System.out.println(myArray);

        List<String> listStrings = new ArrayList();
        listStrings.add("Hola");
        System.out.println(listStrings);

        Map myMap = new HashMap();
        myMap.put("string", myString);
        myMap.put("int",myInt);
        System.out.println(myMap);
        System.out.println(myMap.get("int"));

        Map<String, String> myMapTipado = new HashMap();
        myMapTipado.put("string", myString);
        //aqui hay que convertiro a string porque se lo hemos dicho en os tipos
        myMapTipado.put("int",myInt.toString());
        System.out.println(myMap);
        System.out.println(myMap.get("int"));

        for(int index = 0 ; index < myArray.size(); index++){

            System.out.println(myArray.get(index));
        }
        Main myMain = new Main();
        myMain.myFunction(2,3);
        myMain.myFunction(0,10);

        System.out.print(myMain.myFunctionReturn(3,3));


    }

    public void myFunction(int numero1, int numero2){
        System.out.println(numero1 + numero2);
    }

    //lo mismo pero deolviendo para no usar void
    //le tienes que decir que devuelve
    public int myFunctionReturn (int numero1, int numero2){
        return numero2 + numero1;
    }





    }

