/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.amber;

/**
 * Enumeration of available <i>HTTP</i> methods.
 *
 * Enumerates methods are defined in
 * <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html">HTTP/1.1: Method Definitions</a>.
 *
 * @version $Id$
 */
public enum HTTPMethod {

    /**
     * The {@code HEAD} HTTP method.
     */
    HEAD,

    /**
     * The {@code POST} HTTP method.
     */
    POST,

    /**
     * The {@code PUT} HTTP method.
     */
    PUT,

    /**
     * The {@code GET} HTTP method.
     */
    GET,

    /**
     * The {@code DELETE} HTTP method.
     */
    DELETE,

    /**
     * The {@code OPTIONS} HTTP method.
     */
    OPTIONS,

    /**
     * The {@code TRACE} HTTP method.
     */
    TRACE,

    /**
     * The {@code CONNECT} HTTP method.
     */
    CONNECT;

}
