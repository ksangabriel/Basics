// ---------------------------------------------------------------------------
// This file has been generated by the Web Dynpro Code Generator
// DON'T MODIFY!!! CHANGES WILL BE LOST WHENEVER THE FILE GETS GENERATED AGAIN
// ---------------------------------------------------------------------------
package com.kl.comp.wdp;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.sap.tc.logging.Location;
import com.sap.tc.webdynpro.progmodel.api.*;
import com.sap.tc.webdynpro.progmodel.gci.*;
import com.sap.tc.webdynpro.progmodel.context.*;
import com.sap.tc.webdynpro.progmodel.gci.*;
import com.sap.tc.webdynpro.services.exceptions.WDRuntimeException;

public class InternalMCCompView
  implements IPrivateMCCompView, com.sap.tc.webdynpro.progmodel.gci.IGCIViewDelegate
{

  /**
   * Location for this controller.
   */
  private static final Location logger = Location.getLocation(InternalMCCompView.class);

  /**
   * Framework implementation of Controller that delegates to this.
   */
  private final com.sap.tc.webdynpro.progmodel.gci.IGCIView wdAlterEgo;

  /**
   * Delegate that implements application defined logic
   */
  private final com.kl.comp.MCCompView delegate;


  // ---- Context --------------------------------------------------------------

  IGCINodeInfo infoAvailableCountriesList;
  IGCINodeInfo infoAclUserCountriesList;
  IGCINodeInfo infoAclUser;
  IGCINodeInfo infoAclUserTemp;
  IGCINodeInfo infoContext;

  {

    infoAvailableCountriesList = GCIContext.createMappedNode("AvailableCountriesList", com.kl.bean.CountryBean.class, true, false, false, ".MCComp.AclUser.AvailableCountriesList", true, true, null,
      new IGCIAttributeInfo[] {
        GCIContext.createMappedAttribute("country", "country", false),
        GCIContext.createMappedAttribute("countryCode", "countryCode", false),
      },
      (IGCINodeInfo[])null // no child nodes
    );

    infoAclUserCountriesList = GCIContext.createMappedNode("AclUserCountriesList", com.kl.bean.CountryBean.class, true, false, false, ".MCComp.AclUser.AclUserCountriesList", true, true, null,
      new IGCIAttributeInfo[] {
        GCIContext.createMappedAttribute("country", "country", false),
        GCIContext.createMappedAttribute("countryCode", "countryCode", false),
      },
      (IGCINodeInfo[])null // no child nodes
    );

    infoAclUser = GCIContext.createMappedNode("AclUser", com.kl.bean.CountryDao.class, true, false, false, ".MCComp.AclUser", true, true, null,
      (IGCIAttributeInfo[])null, // no attributes
      new IGCINodeInfo[] {
        infoAvailableCountriesList,
        infoAclUserCountriesList,
      }
    );

    infoAclUserTemp = GCIContext.createNode("AclUserTemp", null, true, false, true, false, false, true, null,
      new IGCIAttributeInfo[] {
        GCIContext.createAttribute("country", "ddic:com.sap.dictionary.string", null, null, false, false),
        GCIContext.createAttribute("countryCode", "ddic:com.sap.dictionary.string", null, null, false, false),
      },
      (IGCINodeInfo[])null // no child nodes
    );

    infoContext = GCIContext.createNode("Context", null, true, true, false, true, false, true, null,
      (IGCIAttributeInfo[])null, // no attributes
      new IGCINodeInfo[] {
        infoAclUser,
        infoAclUserTemp,
      }
    );

  }
  
  private IContextNode contextNode;

  private void wdInitContextNode() {
    contextNode = new IContextNode(this, infoContext, (Node)null);
  }

  public IWDNode wdGetRootNode() {
    return contextNode;
  }

  public IContextNode wdGetContext() {
    return contextNode;
  }


  // ---- Actions --------------------------------------------------------------

  /**
   * Returns the action with name <code>removeItem</code>.
   */
  public IWDAction wdGetRemoveItemAction() {
    return wdAlterEgo.getAction("removeItem");
  }

  /**
   * Returns the action with name <code>update</code>.
   */
  public IWDAction wdGetUpdateAction() {
    return wdAlterEgo.getAction("update");
  }

  /**
   * Returns the action with name <code>add</code>.
   */
  public IWDAction wdGetAddAction() {
    return wdAlterEgo.getAction("add");
  }

  /**
   * Create a new action for this controller. A unique name for the action is generated automatially.
   * @param eventHandler is the action's eventhandler with proper signature
   * @param text is the text displayed in the UI element triggering this action
   */
  public IWDAction wdCreateAction(WDActionEventHandler eventHandler, String text) {
    return wdAlterEgo.createAction(null, eventHandler, text, null);
  }

  /**
   * Create a new action with the given name for this controller
   * @param eventHandler is the action's eventhandler with proper signature
   * @param name is the action's name
   * @param text is the text displayed in the UI element triggering this action
   */
  public IWDAction wdCreateNamedAction(WDActionEventHandler eventHandler, String name, String text) {
    return wdAlterEgo.createAction(name, eventHandler, text, null);
  }

  // ---- Controller part ------------------------------------------------------

  /**
   * Creates a new instance of this controller.
   */
  public InternalMCCompView(com.sap.tc.webdynpro.progmodel.gci.IGCIView alterEgo) {
    this.wdAlterEgo = alterEgo;
    wdInitContextNode();
    this.delegate = new com.kl.comp.MCCompView((IPrivateMCCompView) this);
    wdAlterEgo.createAction("removeItem", WDActionEventHandler.REMOVE_ITEM, "", "");
    wdAlterEgo.createAction("update", WDActionEventHandler.UPDATE, "", "");
    wdAlterEgo.createAction("add", WDActionEventHandler.ADD, "", "");
  }

  /**
   * Returns the public API for this controller instance.
   */
  public com.sap.tc.webdynpro.progmodel.api.IWDViewController wdGetAPI() {
    return (com.sap.tc.webdynpro.progmodel.api.IWDViewController) wdAlterEgo;
  }

  /**
   * Hook method called to initialize view controller.
   */
  public void wdDoInit() {
    logger.pathT("entering: wdDoInit");
    delegate.wdDoInit();
    logger.pathT("exiting: wdDoInit"); 
  }

  /**
   * Hook method called to clean up view controller.
   */
  public void wdDoExit() {
    logger.pathT("entering: wdDoExit");
    delegate.wdDoExit();
    logger.pathT("exiting: wdDoExit"); 
  }

  public Object wdInvokeEventHandler(String handlerName, IWDCustomEvent event)
    throws NoSuchMethodException {
    
    logger.pathT("entering: wdInvokeEventHandler", new Object[] { handlerName } );
    try {
      if("onActionremoveItem".equals(handlerName)) {

        delegate.onActionremoveItem(event );
        return null;
      }
      if("onActionupdate".equals(handlerName)) {

        delegate.onActionupdate(event );
        return null;
      }
      if("onActionadd".equals(handlerName)) {

        delegate.onActionadd(event );
        return null;
      }
      throw new NoSuchMethodException("Eventhandler " + handlerName + " not found for event " + event.getName());
    } finally {
      logger.pathT("exiting: wdInvokeEventHandler"); 
    }
  }

  public void onActionremoveItem(IWDCustomEvent wdEvent ) {
    delegate.onActionremoveItem(wdEvent );
  }

  public void onActionupdate(IWDCustomEvent wdEvent ) {
    delegate.onActionupdate(wdEvent );
  }

  public void onActionadd(IWDCustomEvent wdEvent ) {
    delegate.onActionadd(wdEvent );
  }

  /** outgoing controller usage */
  public com.kl.comp.wdp.IPublicMCComp wdGetMCCompController() {
    return
      (com.kl.comp.wdp.IPublicMCComp)
        wdAlterEgo
          .getComponentGCI()
            .getPublicInterface("MCComp");
  }


  // ---- UI Tree ---------------------------------------------------------

  // create UI tree
  public com.sap.tc.webdynpro.progmodel.api.IWDViewElement wdCreateUITree()
  {

    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTransparentContainer _RootUIElementContainer
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTransparentContainer)
        wdAlterEgo.createElement(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTransparentContainer.class,
          "RootUIElementContainer");  
    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowLayout _RootUIElementContainer__Layout
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowLayout)
        _RootUIElementContainer.createLayout(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowLayout.class);

    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTable _Table1
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTable)
        wdAlterEgo.createElement(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTable.class,
          "Table1");  
    _Table1.bindDataSource("AclUserTemp");
    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData _Table1__LayoutData
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData)
        _Table1.createLayoutData(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData.class);
    _Table1__LayoutData.setPaddingBottom("15px");
    _Table1__LayoutData.setPaddingTop("15px");

    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTableColumn _Column2
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTableColumn)
        wdAlterEgo.createElement(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTableColumn.class,
          "Column2");  

    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDCaption _Column2_header
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDCaption)
        wdAlterEgo.createElement(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDCaption.class,
          "Column2_header");  
    _Column2.setHeader(_Column2_header);

    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDDropDownByKey _DropDownByKey
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDDropDownByKey)
        wdAlterEgo.createElement(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDDropDownByKey.class,
          "DropDownByKey");  
    _DropDownByKey.bindSelectedKey("AclUserTemp.countryCode");
    _Column2.setTableCellEditor(_DropDownByKey);
    _Table1.addColumn(_Column2);

    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTableColumn _Column3
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTableColumn)
        wdAlterEgo.createElement(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDTableColumn.class,
          "Column3");  

    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDCaption _Column3_header
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDCaption)
        wdAlterEgo.createElement(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDCaption.class,
          "Column3_header");  
    _Column3.setHeader(_Column3_header);

    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDButton _Button
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDButton)
        wdAlterEgo.createElement(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDButton.class,
          "Button");  
    _Button.setDesign(com.sap.tc.webdynpro.clientserver.uielib.standard.api.WDButtonDesign.valueOf("emphasized"));
    _Button.setText(wdAlterEgo.getLocalizedText("view.MCCompView.Table1.Column.Column3.TableCellEditor.text"));
    _Button.setOnAction(wdAlterEgo.getAction("removeItem"));
    _Column3.setTableCellEditor(_Button);
    _Table1.addColumn(_Column3);
    _RootUIElementContainer.addChild(_Table1);

    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDButton _Button1
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDButton)
        wdAlterEgo.createElement(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDButton.class,
          "Button1");  
    _Button1.setDesign(com.sap.tc.webdynpro.clientserver.uielib.standard.api.WDButtonDesign.valueOf("emphasized"));
    _Button1.setText(wdAlterEgo.getLocalizedText("view.MCCompView.Button1.text"));
    _Button1.setOnAction(wdAlterEgo.getAction("update"));
    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData _Button1__LayoutData
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData)
        _Button1.createLayoutData(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData.class);
    _Button1__LayoutData.setPaddingTop("15px");
    _RootUIElementContainer.addChild(_Button1);

    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDButton _Button2
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDButton)
        wdAlterEgo.createElement(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDButton.class,
          "Button2");  
    _Button2.setDesign(com.sap.tc.webdynpro.clientserver.uielib.standard.api.WDButtonDesign.valueOf("emphasized"));
    _Button2.setText(wdAlterEgo.getLocalizedText("view.MCCompView.Button2.text"));
    _Button2.setOnAction(wdAlterEgo.getAction("add"));
    com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData _Button2__LayoutData
      = (com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData)
        _Button2.createLayoutData(com.sap.tc.webdynpro.clientserver.uielib.standard.api.IWDFlowData.class);
    _RootUIElementContainer.addChild(_Button2);
    return (_RootUIElementContainer);
  }


  /**
   * Hook method called to modify view before rendering. Access to UI elements
   * is via the given view API only!
   * 
   * @param firstTime indicates whether the hook is called for the first time
   * during the lifetime of this view
   */
  public void wdDoModifyView(IWDView view, boolean firstTime) {
    logger.pathT("entering: doModifyView");
    com.kl.comp.MCCompView.wdDoModifyView((IPrivateMCCompView) this, (IPrivateMCCompView.IContextNode) this.wdGetContext(), view, firstTime);
    logger.pathT("exiting: doModifyView"); 
  }


}
