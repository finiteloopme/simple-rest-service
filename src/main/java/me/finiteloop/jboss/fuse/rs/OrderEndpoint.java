package me.finiteloop.jboss.fuse.rs;

import javax.jws.WebService;

@WebService
public interface OrderEndpoint {
    String order(String partName, int amount, String customerName);
}
