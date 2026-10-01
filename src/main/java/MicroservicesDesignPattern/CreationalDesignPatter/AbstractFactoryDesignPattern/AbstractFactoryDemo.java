package MicroservicesDesignPattern.CreationalDesignPatter.AbstractFactoryDesignPattern;
//Abstract Factory pattern is almost similar to Factory Pattern and is considered as another layer of abstraction over factory pattern.
//Abstract Factory patterns work around a super-factory which creates other factories.
public class AbstractFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UIFactory windowFactory = FactoryProvider.getFactory("Windows");
		Button button = windowFactory.createButton();
		Checkbox checkbox = windowFactory.createCheckbox();
		button.render();
		checkbox.check();
		
		UIFactory macFactory = FactoryProvider.getFactory("Mac");
		Button butoon = macFactory.createButton();
		Checkbox checkbosmac = macFactory.createCheckbox();
		butoon.render();
		checkbosmac.check();
	}

}
//Concrete Product - Windows Button
class WindowsButton implements Button{
	public void render() {
		System.out.println("Rendering a window button");
	}
}

// Concrete Product - Windows Checkbox
class WindowCheckBox implements Checkbox{
	public void check() {
		System.out.println("Checking a window checkbox");
	}
}

//Concrete Product - Mac Button
class MacButton implements Button{
	public void render() {
		System.out.println("Rendering a mac button");
	}
}

class MacCheckbox implements Checkbox{
	public void check(){
		System.out.println("Checking a window checkbox");
	}
}

class WindowFactory implements UIFactory{
	public Button createButton() {
		return new WindowsButton();
	}
	public Checkbox createCheckbox() {
		return new WindowCheckBox();
	}
}

class MacFactory implements UIFactory {
	public Button createButton() {
		return new MacButton();
	}
	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}
}

//Factory Provider
class FactoryProvider{
	public static UIFactory getFactory(String osType) {
		if("Windows".equalsIgnoreCase(osType)) {
			return new WindowFactory();
		}else if("Mac".equalsIgnoreCase(osType)) {
			return new MacFactory();
		}else {
			throw new IllegalArgumentException("Unknow OS Type : "+osType);
		}
	}
}





