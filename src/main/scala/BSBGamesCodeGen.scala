/*
 * Copyrights (C) BSB 2013.
 */

import com.wordnik.swagger.codegen.BasicAndroidGenerator

object BSBGamesCodeGen extends BasicAndroidGenerator {
  def main(args: Array[String]) = {
    try {

      if (args.length == 0) {
        val cargs = Array[String]("http://dev-web-001.mbiux.com/api/resources");
        generateClient(cargs)
      } else {
        generateClient(args)
      }
    } catch {
      case e: Exception => println("Error Occured in Generation: " + e.getMessage())
    }
  }

  // where to write generated code
  override def destinationDir = "client/src/main/java"

  // package for api invoker, error files
  override def invokerPackage = Some("com.wordnik.swagger")

  // package for models
  override def modelPackage = Some("com.bsb.games.client.model")

  // package for api classes
  override def apiPackage = Some("com.bsb.games.client")
}
