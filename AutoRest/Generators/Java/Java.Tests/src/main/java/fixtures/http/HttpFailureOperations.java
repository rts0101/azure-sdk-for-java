/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.http.models.ErrorException;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpFailureOperations.
 */
public interface HttpFailureOperations {
    /**
     * Get empty error form server.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the Boolean object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Boolean> getEmptyError() throws ErrorException, IOException;

    /**
     * Get empty error form server.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getEmptyErrorAsync(final ServiceCallback<Boolean> serviceCallback) throws IllegalArgumentException;

}
