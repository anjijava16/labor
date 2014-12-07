package com.shin.atmosphere.core

import com.shin.atmosphere.rest.TournamentResource
import com.shin.atmosphere.ws.WsResource
import org.atmosphere.nettosphere.{Nettosphere, Config}

/**
 * @author vshin
 */
object Environment {

  def prepare(port: Int, host: String): Config = {
    val builder: Config.Builder = new Config.Builder
    builder
      //.configFile("D:/atmosphere.xml")
      //.resource(classOf[WsResource])
      //.resource(classOf[TournamentResource])
      .port(port)
      .host(host)

    builder.build()
  }

}
