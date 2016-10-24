
package com.learn.pattern;

/**
 * Decorator maintains the interface while adding features.
 *
 */
public class ComponentDecorator implements Component {

	private Component component;

	public ComponentDecorator(Component component) {
		this.component = component;
	}

	public void draw() {
		doBeforeDraw();
		component.draw();
	}
	
	private void  doBeforeDraw(){
		System.out.println("Decoratoring ConcreteComponent");
	};

}
