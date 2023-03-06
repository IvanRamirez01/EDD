/*
 
 */

/**
 *
 * @author José Iván Ramírez Romero
 * Fecha de creación: 06/03/2023
 */
public class Lista {
//ATRIBUTOS
private String lista[];
private byte numElem, tamaño;
//METODOS
/*
Metodo constructor:
- El metodo constructor siempre se llama igual que la clase.
- Es el metodo que inicializa los valores a los atributos.
- Es el metodo que mando a llamar para reservar memoria a un objeto.
- Unico metodo que no lleva tipo de valor de retorno.
*/

//Constructor default o por defecto
public Lista(){
  numElem = 0;
  tamaño = 5;
  lista = new String[tamaño];
  
}

public Lista(byte tamaño){
  numElem = 0;
  this.tamaño = tamaño;
  lista = new String[tamaño];
}

public byte getNumElem(){
  return numElem;
}

public void setNumElem(byte numElem){
  this.numElem = numElem;
}

public byte getTamaño(){
  return tamaño;
}

public void setTamaño(byte tamaño){
  this.tamaño = tamaño;
}


}
