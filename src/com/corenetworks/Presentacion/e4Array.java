package com.corenetworks.Presentacion;

public class e4Array {
    public static void main(String[] args) {
        int mayor =0;
        int contMayor=0;
        int menor =0;
        int contMenor=0;

        int[] num = {2, -4, -13, 1, -3, 15, 1, 9, 6, -8, 4, 23, 7, -13, 13, 23, 15, -13, 9, 0};

        for (int i = 0; i < num.length; i++) {
            //System.out.println(num[i]);
                if (num[i] > mayor)
                    {mayor = num[i];}
                    //System.out.println("el valor de i-->"+ i);
                    //System.out.println("mayor --> " + mayor);
                if (num[i] < menor)
                    {menor = num[i];}
                    //System.out.println("el valor de i-->"+ i);
                    //System.out.println("menor --> " + menor);
        }
        System.out.println("mayor --> " + mayor);
        System.out.println("menor --> " + menor);


        //buscar repeticiones del mayor y del menor

        int repetidoMayor = 0;
        int repetidoMenor = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]==mayor){
                repetidoMayor = repetidoMayor+1;
                }
            if (num[i]==menor){
                repetidoMenor = repetidoMenor+1;
            }

       }
        System.out.println("Veces repetido mayor-->"+ repetidoMayor);
        System.out.println("Veces repetido menor-->"+ repetidoMenor);
    }
}
