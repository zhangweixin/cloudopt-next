/*
 * Copyright 2017 Cloudopt.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  The Apache License v2.0 is available at
 *  http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */
package net.cloudopt.next.web.config

import io.netty.channel.pool.ChannelHealthChecker

/*
 * @author: Cloudopt
 * @Time: 2018/1/9
 * @Description: Cloudopt Next Web configuration file
 */
data class WebConfigBean(var banner: Boolean = true,
                         var bannerName: String = "banner.txt",
                         var dev: Boolean = true,
                         var showRoute: Boolean = true,
                         var cors: Boolean = true,
                         var packageName: String = "",
                         var port: Int = 8080,
                         var staticPackage: String = "static",
                         var webroot: String = "templates",
                         var errorHandler: String = "net.cloudopt.next.web.handler.DefaultErrorHandler",
                         var jsonProvider: String = "net.cloudopt.next.web.json.DefaultJSONProvider",
                         var indexPage: String = "index.html",
                         var cookieCors: Boolean = false,
                         var bodyLimit: Long = 50L * 1024 * 1024,
                         var logColor: Boolean = true,
                         var timeout:Long = 2L * 60 * 1000
)
