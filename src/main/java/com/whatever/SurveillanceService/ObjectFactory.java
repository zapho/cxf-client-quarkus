
package com.whatever.SurveillanceService;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.whatever.SurveillanceService package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.whatever.SurveillanceService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchByCommonNameGroupId }
     * 
     */
    public SearchByCommonNameGroupId createSearchByCommonNameGroupId() {
        return new SearchByCommonNameGroupId();
    }

    /**
     * Create an instance of {@link SearchByCommonNameGroupIdResponse }
     * 
     */
    public SearchByCommonNameGroupIdResponse createSearchByCommonNameGroupIdResponse() {
        return new SearchByCommonNameGroupIdResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSurveillanceCommentCouple }
     * 
     */
    public ArrayOfSurveillanceCommentCouple createArrayOfSurveillanceCommentCouple() {
        return new ArrayOfSurveillanceCommentCouple();
    }

    /**
     * Create an instance of {@link SearchByProductId }
     * 
     */
    public SearchByProductId createSearchByProductId() {
        return new SearchByProductId();
    }

    /**
     * Create an instance of {@link SearchByProductIdResponse }
     * 
     */
    public SearchByProductIdResponse createSearchByProductIdResponse() {
        return new SearchByProductIdResponse();
    }

    /**
     * Create an instance of {@link Surveillance }
     * 
     */
    public Surveillance createSurveillance() {
        return new Surveillance();
    }

    /**
     * Create an instance of {@link SurveillanceCommentCouple }
     * 
     */
    public SurveillanceCommentCouple createSurveillanceCommentCouple() {
        return new SurveillanceCommentCouple();
    }

}
