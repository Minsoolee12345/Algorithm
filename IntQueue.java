package queue;

import java.util.*;

class IntQueueTester
{
   private int[] queue;
   private int front;
   private int rear;
   private int size;
   private int capacity;
   
   public IntQueueTester(int capacity)  
   {
      queue = new int[capacity];
      front = rear = size = 0;
      this.capacity = capacity;
   }
   
   
   public boolean enqueue(int data)
   {
      if(isFull())
      {
         return false;
      }
      
      queue[rear++] = data;
      
      if(rear==capacity)
      {
         rear = 0;
      }
      size++;
      
      return true;
   }
   
   public int dequeue()
   {
      if(isEmpty())
      {
         return -1;
      }
      
      int result = queue[front++];
      
      if(front == capacity)
      {
         front = 0;
      }
      size--;
      
      return result;
   }
   
   public boolean isEmpty()
   {
      return size == 0;
   }
   
   public boolean isFull()
   {
      return size == capacity;
   }
   
   public int getFront()
   {
      if(isEmpty())
      {
         return -1;
      }
      return queue[front];
   }
   
   public int size()
   {
      return size;
   }
   
   public int getCapacity()
   {
      return capacity;
   }
   
   public void clear()
   {
      size = front = rear = 0;
   }
   
   public void dump()
   {
      // empty
      if(isEmpty())
      {
         System.out.println("Queue가 비어 있습니다.");
      }
      // front < rear
      else if(front < rear)
      {
         for(int i = front; i < rear; i++)
         {
            System.out.print(queue[i] + " ");
         }
         System.out.println();
      }
      // front >= rear
      else
      {
         // front -> capacity -1
         for(int i = front; i < capacity - 1; i++)  
         {
            System.out.print(queue[i] + " ");
         }
         
         // 0 -> rear -1
         for(int i = 0; i < rear - 1; i++)
         {
            System.out.print(queue[i] + " ");
         }
         System.out.println(); 
      }
   }
}


public class IntQueue 
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      
      IntQueueTester s = new IntQueueTester(64);
      
      while(true)
      {
         System.out.println();
         System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
         System.out.print("(1) 인큐  (2) 디큐  (3) 피크  (4) 덤프  (0) 종료: ");
         
         int menu = in.nextInt();
         if(menu==0) break;

         int x;
         
         switch(menu)
         {
         case 1:
            System.out.print("데이터: ");
            x = in.nextInt();
            if(!s.enqueue(x))
            {
               System.out.println("큐가 가득 찼습니다.");
            }
            break;
            
         case 2:
            if(s.isEmpty())
            {
               System.out.println("큐가 비어 있습니다.");
            }
            else
            {
               x = s.dequeue();
               System.out.println("디큐한 데이터는 " + x + "입니다.");
            }
            break;
            
         case 3:
            if(s.isEmpty())
            {
               System.out.println("큐가 비어 있습니다.");
            }
            else
            {
               x = s.getFront();
               System.out.println("피크한 데이터는 " + x + "입니다.");
            }
            break;
            
         case 4:
            s.dump();
            break;
         }
      }
      in.close();
   }
}