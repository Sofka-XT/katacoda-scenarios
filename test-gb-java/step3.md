Basado en los siguientes ejemplos:

```java
public final void subscribe(EventChange eventChange) {
    this.observables.addAll(eventChange.behaviors);
}

public final void applyEvent(DomainEvent domainEvent) {
    observables.forEach(consumer::accept(domainEvent));
}
```
**RESPONDER A CONTINUACIÓN**

¿Qué tipo de colección es preferible para que no se repitan eventos en el momento de recorrer el observables?

***Responder en el campus***
- A. Map
- B. List
- C. Set
- D. ArrayList
