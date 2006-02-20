/*
 * Copyright 2006 The Apache Software Foundation.
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
package schema.annotations;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * All XSModel Tests
 * 
 * @version $Id: $
 */
public class AllTests {

    public static void main(String[] args) {
        junit.textui.TestRunner.run(AllTests.suite());
    }
    public static Test suite() {
        TestSuite suite = new TestSuite("Test for Schema Annotations");
        //$JUnit-BEGIN$
        suite.addTestSuite(XSAttributeGroupAnnotationsTest.class);
        suite.addTestSuite(XSNotationAnnotationsTest.class);
        suite.addTestSuite(XSElementAnnotationsTest.class);
        suite.addTestSuite(XSAttributeUseAnnotationsTest.class);
        suite.addTestSuite(XSAttributeAnnotationsTest.class);
        suite.addTestSuite(XSFacetAnnotationsTest.class);
        suite.addTestSuite(XSModelGroupDefinitionAnnotationsTest.class);
        suite.addTestSuite(XSModelGroupAnnotationsTest.class);
        suite.addTestSuite(XSParticleAnnotationsTest.class);
        suite.addTestSuite(XSWildcardAnnotationsTest.class);
        //$JUnit-END$
        return suite;
    }

}
