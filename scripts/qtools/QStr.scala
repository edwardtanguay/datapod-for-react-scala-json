package qtools 

import scala.util.Random

object QStr {
  def generateSuuid(): String = {
    val chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    val result = (1 to 6).map(_ => chars(Random.nextInt(chars.length))).mkString
    result
  }
}