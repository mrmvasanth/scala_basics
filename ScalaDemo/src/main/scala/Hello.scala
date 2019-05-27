class Add(){

  def cal(aa:Int,bb:Int): Unit ={
    println("Sum:"+(aa+bb));
  }
}

class Sub(){
  def cal(aa:Int,bb:Int){
    println("Diff:" + (aa - bb))
  }
}

class oper extends Add(){

}

class arr(){
  def arrFun(getEle:Int):Int={
    var inc=0;var count=9;
    var arrOfEle=new Array[Int](10);
    for(inc <- 0 to count){
        arrOfEle(inc)=inc;
    }
    return arrOfEle(getEle);
  }
}

object Hello {
  def main(args: Array[String]): Unit = {
    val addOb=new Add()
    addOb.cal(4,1);
    val subOb=new Sub();
    subOb.cal(5,10);
    val operOb=new oper();
    operOb.cal(15,10);
    val arrOb=new arr();
    arrOb.arrFun(6)
    addOb.cal(arrOb.arrFun(6),arrOb.arrFun(8) )
  }

}
