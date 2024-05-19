package IntroductionToPrinciplesOfOops.EncapsulationAndAbstraction;

public class Main {
    // What is Encapsulation ?
    // Wrapping up the implementation of the data members and methods inside a class.

    // The Encapsulation concepts comes under the category of implementation part.
    // Like we got the requirements from the user and, we need to Encapsulate all the implementation details
    // so that user will only have the access of exposed utilities.

    // We can do Data hiding via access modifiers like private.
    // To get a private property we should use a getter. Which follows the concept of Encapsulation.

    // What is Abstraction ?
    // hiding the unnecessary details but only showing the relevant details or info.

    // Eg: A Car
    // We need to start the car we put the key in keyhole and start it up.
    // We don't need the info how the engine is working or how power up happens. Details of internal mechanics are
    // unnecessary for us. So the hiding of this extra unnecessary info is Abstraction.

    // Eg: System.out.println(); => we don;t want to know how printing is working here, we just want to print something.
    // Eg: Utility libraries: We don't want to know the internal implementation, we just need to access the utilities.

    // This Abstraction concept comes in the category of designing a system.
    // We need to make our system less complicated for a user.
    // Abstraction can be achieved in java by using Abstraction classes and interfaces.

    // PS: Writing the code using concepts like encapsulation gives us the Abstraction layer.
    // So Encapsulation is solving the implementation level issue, and Abstraction is solving
    // the design level issue.

    // Both Abstraction and Encapsulation are for data hiding the main point is about design level (Abstraction)
    // and implementation level (Encapsulation).

    // Data-Hiding: For security purposes and hiding complexities as well we generally use private keyword.
    // Encapsulation: For hiding complexities, properties can be public still Encapsulation rule will be followed.
}
