/* Copyright 2004, 2005, 2006 Acegi Technology Pty Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.security.providers.jaas;

import org.springframework.security.SpringSecurityException;
import org.springframework.security.AuthenticationServiceException;

import javax.security.auth.login.LoginException;


/**
 * This LoginExceptionResolver simply wraps the LoginException with an AuthenticationServiceException.
 *
 * @author Ray Krueger
 * @version $Revision: 2142 $
 */
public class DefaultLoginExceptionResolver implements LoginExceptionResolver {
    //~ Methods ========================================================================================================

    public SpringSecurityException resolveException(LoginException e) {
        return new AuthenticationServiceException(e.getMessage(), e);
    }
}
