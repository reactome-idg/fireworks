package org.reactome.web.fireworks.handlers;

import org.reactome.web.fireworks.events.ShowReacfoamButtonEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ShowReacfoamButtonHandler extends EventHandler{
	void onToggleReactfoamButton(ShowReacfoamButtonEvent toggleReactfoamButtonEvent);
}
