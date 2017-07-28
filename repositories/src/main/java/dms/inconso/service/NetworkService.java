/**
 * 
 */
package dms.inconso.service;

import java.util.List;

import dms.inconso.entities.Network;

/**
 * @author rmidi
 *
 */
public interface NetworkService {
	/*
	 * here we define
	 * our Network service
	 * methods
	 */
	void saveNetwork(Network like);
    void updateNetwork(Network like);
    void deleteNetworkById(Long id);
    void deleteAllNetworks();
    List<Network> getAllNetwork();
}
