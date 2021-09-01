package com.example

import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom

object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world")

    // using react produces the error
    /*
    val mountNode = dom.document.getElementsByClassName("app")(0)

    val HelloMessage = ScalaComponent.builder[String]
      .render($ => <.div("Hello ", $.props))
      .build

    HelloMessage("John").renderIntoDOM(mountNode)
//  */
  }
}