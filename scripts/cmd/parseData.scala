import qtools.QStr

object ParseData:
  def main(args: Array[String]): Unit = {
    var suuid = QStr.generateSuuid()
    println("Generated SUUID: " + suuid)
  }

