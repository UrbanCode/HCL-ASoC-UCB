/**
 * (c) Copyright IBM Corporation 2015.
 * (c) Copyright HCL Technologies Ltd. 2018. All Rights Reserved.
 * This is licensed under the following license.
 * The Eclipse Public 1.0 License (http://www.eclipse.org/legal/epl-v10.html)
 * U.S. Government Users Restricted Rights:  Use, duplication or disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
 */

package com.urbancode.air.plugin.AppScanSaaS

import java.util.Properties

/**
 * Class used to initiate the login to the ASoC server.
 */
public class SCXRestClient extends RestClient {
    private String keyId
    private String keySecret

	public SCXRestClient(Properties props) {
		super(props)
        this.keyId = props['keyId']
        this.keySecret = props['keySecret']
        login()
	}

	@Override
	protected def login() {
		scxLogin(this.keyId, this.keySecret)
		assertLogin()
	}
}
