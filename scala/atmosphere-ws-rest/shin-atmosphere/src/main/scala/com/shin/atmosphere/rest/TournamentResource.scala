package com.shin.atmosphere.rest

import java.util.Random
import javax.ws.rs.{Path, GET}
import javax.ws.rs.core.Context

import org.atmosphere.config.service.AtmosphereService
import org.atmosphere.cpr.AtmosphereResource

/**
 * @author vshin
 */
@Path("/tournament")
@AtmosphereService(path="/tournament", servlet = "com.sun.jersey.spi.container.servlet.ServletContainer")
class TournamentResource {

  val randomizator = new Random()

  @GET
  @Path("/info")
  def info(@Context resource: AtmosphereResource): String = {
    randomizator.nextInt(100).toString
  }

}
