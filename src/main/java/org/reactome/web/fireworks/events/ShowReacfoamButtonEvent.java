package org.reactome.web.fireworks.events;

import com.google.gwt.event.shared.GwtEvent;
import org.reactome.web.fireworks.handlers.ShowReacfoamButtonHandler;

public class ShowReacfoamButtonEvent extends GwtEvent<ShowReacfoamButtonHandler>{
	public static Type<ShowReacfoamButtonHandler> TYPE = new Type<ShowReacfoamButtonHandler>();
	
	private boolean showReactfoamButton;
	
	public ShowReacfoamButtonEvent(boolean showReactfoamButton) {
		this.showReactfoamButton = showReactfoamButton;
	}
	
	@Override
	public Type<ShowReacfoamButtonHandler> getAssociatedType() {
		return TYPE;
	}
	
	@Override
	protected void dispatch(ShowReacfoamButtonHandler handler) {
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
