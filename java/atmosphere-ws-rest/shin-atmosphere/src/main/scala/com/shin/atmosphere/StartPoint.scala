package com.shin.atmosphere

import com.shin.atmosphere.core.{Environment, Server}

/**
 * Hello world
 */
object StartPoint {

  def main(args: Array[String]): Unit = {
    val config = Environment.prepare(8080, "127.0.0.1")
    Server.run(config)
  }

}
