package org.reactome.web.fireworks.events;

import com.google.gwt.event.shared.GwtEvent;
import org.reactome.web.fireworks.handlers.ShowReactfoamButtonHandler;

public class ShowReactfoamButtonEvent extends GwtEvent<ShowReactfoamButtonHandler>{
	public static Type<ShowReactfoamButtonHandler> TYPE = new Type<ShowReactfoamButtonHandler>();
	
	private boolean showReactfoamButton;
	
	public ShowReactfoamButtonEvent(boolean showReactfoamButton) {
		this.showReactfoamButton = showReactfoamButton;
	}
	
	@Override
	public Type<ShowReactfoamButtonHandler> getAssociatedType() {
		return TYPE;
	}
	
	@Override
	protected void dispatch(ShowReactfoamButtonHandler handler) {
		handler.onToggleReactfoamButton(this);
	}
	
	public boolean getShowReactfoamButton() {
		return this.showReactfoamButton;
	}
	
	@Override
	public String toString() {
		return "toggle foam button" + this.showReactfoamButton;
	}
}
