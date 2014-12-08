package com.shin.atmosphere.core

import org.atmosphere.nettosphere.Config

/**
 * @author vshin
 */
object Environment {

  def prepare(port: Int, host: String): Config = {
    val builder: Config.Builder = new Config.Builder
    builder
      .initParam("com.sun.jersey.config.property.packages", "com.shin.atmosphere")
      //.configFile("atmosphere.xml")
      //.resource(classOf[WsResource])
      //.resource(classOf[TournamentResource])
      .port(port)
      .host(host)

    builder.build()
  }

}
