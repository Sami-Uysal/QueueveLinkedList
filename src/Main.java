
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    
    public static void main(String[] args) {
        /*
* Queue(Kuyruk) Interface'ini implemente eden LinkedList Classı FIFO(First In, First Out Mantığıyla Çalışır.) 
* add(Eleman) ----> Elemanı Kuyruğa Ekler. Ekleyemezse Hata Fırlatır.
* offer(Eleman) ----> Elemanı Kuyruğa Ekler. Eklerse True Döner, Ekleyemezse False Döner.
* remove() ----> Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa hata fırlatır.
* poll() ------> Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa null referans döner.
* element() ----> Kuyruğun en başındaki elemanı döner. Kuyruk boşsa ,  hata fırlatır.
* peek() ------> Kuyruğun en başındaki elemanı döner. Kuyruk boşsa , null referans döner.
*
		  
		 */
      Queue<String> queue = new LinkedList<String>();
      System.out.println(queue.isEmpty());
      queue.offer("Java");
      queue.offer("Python");
      queue.offer("Php");
      queue.offer("C++");
      
      
        //System.out.println(queue.peek());
        
        for (String s: queue) {
            System.out.println(s);
            
        }
        System.out.println("***************************");
        //System.out.println("Eleman Çıkarılıyor : " + queue.poll());
        
        for (String s: queue) {
            System.out.println(s);
            
        }
        System.out.println(queue.isEmpty());
        
        while (!queue.isEmpty()) {
            System.out.println("Eleman Çıkarılıyor : " + queue.poll());
            
            
        }
    }
    
}
