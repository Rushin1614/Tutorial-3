object Question4 extends App{

  def bookPrice(x:Int):Double=x*24.95

  def discount(amount:Double):Double=amount*0.4

  def shippingCost(x:Int):Double= 3*50 + (x-50)*0.75

  def TotalPrice(x:Int):Double =bookPrice(x)+shippingCost(x)-discount(bookPrice(x))


  printf("\nTotal book price is Rs: %.2f\n",TotalPrice(60))


}
