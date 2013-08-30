/*
 * Copyrights (C) BSB 2013.
 */

package com.wordnik.swagger.codegen

import com.wordnik.swagger.model._

object BasicUnityCSharpGenerator extends BasicUnityCSharpGenerator {
  def main(args: Array[String]) = generateClient(args)
}

class BasicUnityCSharpGenerator extends BasicCSharpGenerator { 
  // supporting classes
  override def supportingFiles =
    List(
      ("apiInvoker.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ApiInvoker.cs"),
      ("apiException.mustache", destinationDir + java.io.File.separator + invokerPackage.get.replace(".", java.io.File.separator) + java.io.File.separator, "ApiException.cs"),
      ("Newtonsoft.Json.dll", "generated-code/csharp/bin", "Newtonsoft.Json.dll"),
      ("compile.mustache", "generated-code/csharp", "compile.bat"))
}