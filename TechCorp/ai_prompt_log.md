AI Prompt & Notes Log

1) Prompt: "Why is using String type + switch/if-else to dispatch behavior an anti-pattern in OOP?"
   - Notes: Violates Open/Closed Principle; centralizes logic; increases coupling; hard to test; adding new types requires editing existing code.

2) Prompt: "Should Employee be an abstract class or an interface?"
   - Notes: Use abstract class when sharing common state (e.g., `name`) and default behavior; use interface if only behavior contracts are needed. Here `Employee` holds shared fields so abstract class fits better.

3) Prompt: "How does Java choose the right overridden method at runtime?"
   - Notes: Java uses Dynamic Method Dispatch (late binding) via the virtual method table; calling `emp.calculateSalary()` on a reference typed `Employee` invokes the subclass implementation at runtime.
