package com.shin.atmosphere.core

import org.atmosphere.nettosphere.{Config, Nettosphere}

/**
 * @author vshin
 */
object Server {

  var server: Nettosphere = _

  def run(config: Config): Unit = {
    server = new Nettosphere.Builder().config(config).build
    server.start()
  }

}
