package com.shin.atmosphere.ws

import org.atmosphere.config.service._
import org.atmosphere.cpr.AtmosphereResource
import org.slf4j.LoggerFactory

/**
 * @author vshin
 */
@ManagedService(path="/websocket")
class WsResource {

  private[this] val logger = LoggerFactory.getLogger(getClass)

  @Ready
  def ready(resource: AtmosphereResource): Unit = {
    logger.info("/websocket ready")
  }

  @Get
  def get(resource: AtmosphereResource): Unit = {
    logger.info("/websocket get")
  }

  @Post
  def post(resource: AtmosphereResource): Unit = {
    logger.info("/websocket post")
  }
}
