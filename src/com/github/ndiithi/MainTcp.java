/*
 * Copyright 2017 duncan.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.ndiithi;

import com.github.terma.javaniotcpproxy.StaticTcpProxyConfig;
import com.github.terma.javaniotcpproxy.TcpProxy;
import com.github.terma.javaniotcpproxy.TcpProxyConfig;
import com.github.terma.javaniotcpserver.TcpServer;
import com.github.terma.javaniotcpserver.TcpServerConfig;
import com.github.terma.javaniotcpserver.TcpServerHandlerFactory;

/**
 *
 * @author duncan
 */
public class MainTcp {
    
     
    public static void main(String args[]){
        System.out.println("Proxy starting...");
        StaticTcpProxyConfig proxConfig=new StaticTcpProxyConfig(localPort,"remoteHost",remotePort);
        proxConfig.setWorkerCount(5);

        new TcpProxy(proxConfig).start();
        System.out.println("Proxy started");
    }
}
