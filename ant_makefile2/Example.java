class Example
{
   public int i;
   public char c;

   public static void main(String[] args) {
       Example app = new Example();

       app.i = 200000;
       app.c = 'c';

       int result = app.callNative(app.i, app.c);
       System.out.println("Result = "  + result);
   }

   private native int callNative(int iParam, char cParam);

   static
   {
       System.loadLibrary("native");
   }
}