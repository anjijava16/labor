package com.shin.atmosphere.rest

import javax.ws.rs.{Path, GET}
import javax.ws.rs.core.Context

import org.atmosphere.config.service.{ManagedService, AtmosphereService}
import org.atmosphere.cpr.AtmosphereResource

/**
 * @author vshin
 */
@Path("/tournament")
@AtmosphereService(path="/tournament", servlet = "com.sun.jersey.spi.container.servlet.ServletContainer")
class TournamentResource {

  @GET
  @Path("/info")
  def info(@Context resource: AtmosphereResource): String = {
    "ok"
  }

}
