// ---------------------------------------------------------------------------
// This file has been generated partially by the Web Dynpro Code Generator.
// MODIFY CODE ONLY IN SECTIONS ENCLOSED BY @@begin AND @@end.
// ALL OTHER CHANGES WILL BE LOST IF THE FILE IS REGENERATED.
// ---------------------------------------------------------------------------
package com.kl.comp;

// 
// IMPORTANT NOTE: 
// _ALL_ IMPORT STATEMENTS MUST BE PLACED IN THE FOLLOWING SECTION ENCLOSED
// BY @@begin imports AND @@end. FURTHERMORE, THIS SECTION MUST ALWAYS CONTAIN
// AT LEAST ONE IMPORT STATEMENT (E.G. THAT FOR IPrivateMCCompView).
// OTHERWISE, USING THE ECLIPSE FUNCTION "Organize Imports" FOLLOWED BY
// A WEB DYNPRO CODE GENERATION (E.G. PROJECT BUILD) WILL RESULT IN THE LOSS
// OF IMPORT STATEMENTS.
//
//@@begin imports
import java.util.ArrayList;
import java.util.List;

import com.kl.bean.CountryBean;
import com.kl.bean.CountryDao;
import com.kl.comp.wdp.IPrivateMCCompView;
import com.sap.tc.webdynpro.progmodel.api.IWDAttributeInfo;
import com.sap.tc.webdynpro.progmodel.api.IWDNodeInfo;
import com.sap.typeservices.IModifiableSimpleValueSet;
//@@end

//@@begin documentation
//@@end

public class MCCompView
{
  /**
   * Logging location.
   */
  private static final com.sap.tc.logging.Location logger = 
    com.sap.tc.logging.Location.getLocation(MCCompView.class);

  static 
  {
    //@@begin id
    String id = "$Id$";
    //@@end
    com.sap.tc.logging.Location.getLocation("ID.com.sap.tc.webdynpro").infoT(id);
  }

  /**
   * Private access to the generated Web Dynpro counterpart 
   * for this controller class.  </p>
   *
   * Use <code>wdThis</code> to gain typed access to the context,
   * to trigger navigation via outbound plugs, to get and enable/disable
   * actions, fire declared events, and access used controllers and/or 
   * component usages.
   *
   * @see com.kl.comp.wdp.IPrivateMCCompView for more details
   */
  private final IPrivateMCCompView wdThis;

  /**
   * Root node of this controller's context. </p>
   *
   * Provides typed access not only to the elements of the root node 
   * but also to all nodes in the context (methods node<i>XYZ</i>()) 
   * and their currently selected element (methods current<i>XYZ</i>Element()). 
   * It also facilitates the creation of new elements for all nodes 
   * (methods create<i>XYZ</i>Element()). </p>
   *
   * @see com.kl.comp.wdp.IPrivateMCCompView.IContextNode for more details.
   */
  private final IPrivateMCCompView.IContextNode wdContext;

  /**
   * A shortcut for <code>wdThis.wdGetAPI()</code>. </p>
   * 
   * Represents the generic API of the generic Web Dynpro counterpart 
   * for this controller. </p>
   */
  private final com.sap.tc.webdynpro.progmodel.api.IWDViewController wdControllerAPI;
  
  /**
   * A shortcut for <code>wdThis.wdGetAPI().getComponent()</code>. </p>
   * 
   * Represents the generic API of the Web Dynpro component this controller 
   * belongs to. Can be used to access the message manager, the window manager,
   * to add/remove event handlers and so on. </p>
   */
  private final com.sap.tc.webdynpro.progmodel.api.IWDComponent wdComponentAPI;
  
  public MCCompView(IPrivateMCCompView wdThis)
  {
    this.wdThis = wdThis;
    this.wdContext = wdThis.wdGetContext();
    this.wdControllerAPI = wdThis.wdGetAPI();
    this.wdComponentAPI = wdThis.wdGetAPI().getComponent();
  }

  //@@begin javadoc:wdDoInit()
  /** Hook method called to initialize controller. */
  //@@end
  public void wdDoInit()
  {
    //@@begin wdDoInit()
    
    
	IWDNodeInfo nodeInfo                   = wdContext.getNodeInfo();
	IWDAttributeInfo dateAttributeInfo     = nodeInfo.getChild("AclUserTemp").getAttribute("countryCode");
	IModifiableSimpleValueSet dropValueSet = dateAttributeInfo.getModifiableSimpleType().getSVServices().getModifiableSimpleValueSet();
	
	CountryDao dao = new CountryDao();
	wdContext.nodeAclUser().bind(dao);
	
	for(int i = 0; i < wdContext.nodeAclUser().nodeAvailableCountriesList().size(); i++) {
		String countryCode = wdContext.nodeAclUser().nodeAvailableCountriesList().getAvailableCountriesListElementAt(i).getCountryCode();
		String country = wdContext.nodeAclUser().nodeAvailableCountriesList().getAvailableCountriesListElementAt(i).getCountry();
		dropValueSet.put(countryCode, country);
	}
    
	wdContext.nodeAclUser().bind(dao);
    for(int i = 0; i < wdContext.nodeAclUser().nodeAclUserCountriesList().size(); i++) {
		IPrivateMCCompView.IAclUserTempElement e =  wdContext.nodeAclUserTemp().createAclUserTempElement();
		e.setCountry(wdContext.nodeAclUser().nodeAclUserCountriesList().getAclUserCountriesListElementAt(i).getCountry());
		e.setCountryCode(wdContext.nodeAclUser().nodeAclUserCountriesList().getAclUserCountriesListElementAt(i).getCountryCode());
		wdContext.nodeAclUserTemp().addElement(e);
    } 
    

    
    //@@end
  }

  //@@begin javadoc:wdDoExit()
  /** Hook method called to clean up controller. */
  //@@end
  public void wdDoExit()
  {
    //@@begin wdDoExit()

    //@@end
  }

  //@@begin javadoc:wdDoModifyView
  /**
   * Hook method called to modify a view just before rendering.
   * This method conceptually belongs to the view itself, not to the
   * controller (cf. MVC pattern).
   * It is made static to discourage a way of programming that
   * routinely stores references to UI elements in instance fields
   * for access by the view controller's event handlers, and so on.
   * The Web Dynpro programming model recommends that UI elements can
   * only be accessed by code executed within the call to this hook method.
   *
   * @param wdThis Generated private interface of the view's controller, as
   *        provided by Web Dynpro. Provides access to the view controller's
   *        outgoing controller usages, etc.
   * @param wdContext Generated interface of the view's context, as provided
   *        by Web Dynpro. Provides access to the view's data.
   * @param view The view's generic API, as provided by Web Dynpro.
   *        Provides access to UI elements.
   * @param firstTime Indicates whether the hook is called for the first time
   *        during the lifetime of the view.
   */
  //@@end
  public static void wdDoModifyView(IPrivateMCCompView wdThis, IPrivateMCCompView.IContextNode wdContext, com.sap.tc.webdynpro.progmodel.api.IWDView view, boolean firstTime)
  {
    //@@begin wdDoModifyView
    
    
    //@@end
  }

  //@@begin javadoc:onActionremoveItem(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onActionremoveItem(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onActionremoveItem(ServerEvent)
	String cc = wdContext.nodeAclUserTemp().createAclUserTempElement().getAttributeAsText("countryCode");
	wdContext.nodeAclUserTemp().removeElement(wdContext.nodeAclUserTemp().currentAclUserTempElement());
    //@@end
  }

  //@@begin javadoc:onActionupdate(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onActionupdate(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onActionupdate(ServerEvent)
	CountryDao dao = new CountryDao();
	List updateList = new ArrayList();
	
	for(int i = 0; i < wdContext.nodeAclUserTemp().size(); i++) {
		
		CountryBean cb = new CountryBean();
		cb.setCountry(wdContext.nodeAclUserTemp().getAclUserTempElementAt(i).getCountry());
		cb.setCountryCode(wdContext.nodeAclUserTemp().getAclUserTempElementAt(i).getCountryCode());
		updateList.add(cb);
	}
	wdContext.nodeAclUser().invalidate();
	//wdContext.nodeAclUserTemp().invalidate();

	dao.setAclUserCountriesList(updateList);
	wdContext.nodeAclUser().bind(dao);
    //@@end
  }

  //@@begin javadoc:onActionadd(ServerEvent)
  /** Declared validating event handler. */
  //@@end
  public void onActionadd(com.sap.tc.webdynpro.progmodel.api.IWDCustomEvent wdEvent )
  {
    //@@begin onActionadd(ServerEvent)
	IPrivateMCCompView.IAclUserTempElement e =  wdContext.nodeAclUserTemp().createAclUserTempElement();
	wdContext.nodeAclUserTemp().addElement(e);
    //@@end
  }

  /*
   * The following code section can be used for any Java code that is 
   * not to be visible to other controllers/views or that contains constructs
   * currently not supported directly by Web Dynpro (such as inner classes or
   * member variables etc.). </p>
   *
   * Note: The content of this section is in no way managed/controlled
   * by the Web Dynpro Designtime or the Web Dynpro Runtime. 
   */
  //@@begin others
  //@@end
}
