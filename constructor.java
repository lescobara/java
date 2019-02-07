public class Coordenadas {
        private int x,y;//Atributos
                      public Coordenadas (int x1 , int y1)//constructor
                      {
                         //asignamos esos valores
                                  x=x1;
                                  y=y1;
                     }
                     public double Distancia (int x1, int y1)
                     {
                         //este método recibe como parametros
                                  //las coordenadas del segundo punto
                         double D;
                                 D=Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
                                 return D;//Retornamops el valor de la distancia
                     }
                    public void Pmedio(int x1, int y1)
                    {
                        double p1, p2;
                        p1=(x+x1)/2;
                        p2=(y+y1)/2;
                        System.out.println("El puntomedio es: "+p1+","+p2);
                    }
        }

 

 /*Archivo UsaCoordenadas.java*/
 public class UsaCoordenadas {
 public static void main (String args []){
      Coordenadas P=new Coordenadas (10,20);
           //calculamos la Distancia:
           System.out.println("La Distancia es: "+P.Distancia(5,6));
           //Punto Medio
           P.Pmedio(5,6);
          }
 }
 
 /*Tomado de http://programandoenjava.over-blog.es/article-32829724.html*/
