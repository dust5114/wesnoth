/*
* generated by Xtext
*/

package org.wesnoth.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;


@Singleton
public class WMLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class RootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Root");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTextdomainsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cTextdomainsTextDomainParserRuleCall_0_0 = (RuleCall)cTextdomainsAssignment_0.eContents().get(0);
		private final Assignment cPreprocAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPreprocPreprocessorParserRuleCall_1_0 = (RuleCall)cPreprocAssignment_1.eContents().get(0);
		private final Assignment cRootsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRootsRootTypeParserRuleCall_2_0 = (RuleCall)cRootsAssignment_2.eContents().get(0);
		
		//Root:
		//	textdomains+=TextDomain* preproc+=Preprocessor* roots+=RootType*;
		public ParserRule getRule() { return rule; }

		//textdomains+=TextDomain* preproc+=Preprocessor* roots+=RootType*
		public Group getGroup() { return cGroup; }

		//textdomains+=TextDomain*
		public Assignment getTextdomainsAssignment_0() { return cTextdomainsAssignment_0; }

		//TextDomain
		public RuleCall getTextdomainsTextDomainParserRuleCall_0_0() { return cTextdomainsTextDomainParserRuleCall_0_0; }

		//preproc+=Preprocessor*
		public Assignment getPreprocAssignment_1() { return cPreprocAssignment_1; }

		//Preprocessor
		public RuleCall getPreprocPreprocessorParserRuleCall_1_0() { return cPreprocPreprocessorParserRuleCall_1_0; }

		//roots+=RootType*
		public Assignment getRootsAssignment_2() { return cRootsAssignment_2; }

		//RootType
		public RuleCall getRootsRootTypeParserRuleCall_2_0() { return cRootsRootTypeParserRuleCall_2_0; }
	}

	public class TextDomainElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TextDomain");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTextdomainKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDomainNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDomainNameIDTerminalRuleCall_1_0 = (RuleCall)cDomainNameAssignment_1.eContents().get(0);
		
		//TextDomain:
		//	"#textdomain " DomainName=ID;
		public ParserRule getRule() { return rule; }

		//"#textdomain " DomainName=ID
		public Group getGroup() { return cGroup; }

		//"#textdomain "
		public Keyword getTextdomainKeyword_0() { return cTextdomainKeyword_0; }

		//DomainName=ID
		public Assignment getDomainNameAssignment_1() { return cDomainNameAssignment_1; }

		//ID
		public RuleCall getDomainNameIDTerminalRuleCall_1_0() { return cDomainNameIDTerminalRuleCall_1_0; }
	}

	public class PreprocessorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Preprocessor");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMacroParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cPathIncludeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Preprocessor:
		//	Macro | PathInclude;
		public ParserRule getRule() { return rule; }

		//Macro | PathInclude
		public Alternatives getAlternatives() { return cAlternatives; }

		//Macro
		public RuleCall getMacroParserRuleCall_0() { return cMacroParserRuleCall_0; }

		//PathInclude
		public RuleCall getPathIncludeParserRuleCall_1() { return cPathIncludeParserRuleCall_1; }
	}

	public class MacroElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Macro");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cMacroContentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMacroContentIDTerminalRuleCall_1_0 = (RuleCall)cMacroContentAssignment_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//Macro:
		//	"{" macroContent+=ID+ "}";
		public ParserRule getRule() { return rule; }

		//"{" macroContent+=ID+ "}"
		public Group getGroup() { return cGroup; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }

		//macroContent+=ID+
		public Assignment getMacroContentAssignment_1() { return cMacroContentAssignment_1; }

		//ID
		public RuleCall getMacroContentIDTerminalRuleCall_1_0() { return cMacroContentIDTerminalRuleCall_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}

	public class PathIncludeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "PathInclude");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPathAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cPathAlternatives_1_0 = (Alternatives)cPathAssignment_1.eContents().get(0);
		private final RuleCall cPathHOMEPATHParserRuleCall_1_0_0 = (RuleCall)cPathAlternatives_1_0.eContents().get(0);
		private final RuleCall cPathPATHTerminalRuleCall_1_0_1 = (RuleCall)cPathAlternatives_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//PathInclude:
		//	"{" path=(HOMEPATH | PATH) "}";
		public ParserRule getRule() { return rule; }

		//"{" path=(HOMEPATH | PATH) "}"
		public Group getGroup() { return cGroup; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }

		//path=(HOMEPATH | PATH)
		public Assignment getPathAssignment_1() { return cPathAssignment_1; }

		//HOMEPATH | PATH
		public Alternatives getPathAlternatives_1_0() { return cPathAlternatives_1_0; }

		//HOMEPATH
		public RuleCall getPathHOMEPATHParserRuleCall_1_0_0() { return cPathHOMEPATHParserRuleCall_1_0_0; }

		//PATH
		public RuleCall getPathPATHTerminalRuleCall_1_0_1() { return cPathPATHTerminalRuleCall_1_0_1; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_2() { return cRightCurlyBracketKeyword_2; }
	}

	public class RootTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RootType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cStartTagAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cStartTagRootTagParserRuleCall_1_0 = (RuleCall)cStartTagAssignment_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSubTypesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSubTypesRootTypeParserRuleCall_3_0 = (RuleCall)cSubTypesAssignment_3.eContents().get(0);
		private final Assignment cAtAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAtAttributesParserRuleCall_4_0 = (RuleCall)cAtAssignment_4.eContents().get(0);
		private final Assignment cOkpreprocAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cOkpreprocPreprocessorParserRuleCall_5_0 = (RuleCall)cOkpreprocAssignment_5.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cSolidusKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cEndTagAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cEndTagRootTagParserRuleCall_8_0 = (RuleCall)cEndTagAssignment_8.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//RootType:
		//	"[" startTag=RootTag "]" subTypes+=RootType* at+=Attributes* okpreproc+=Preprocessor* "[" "/" endTag=RootTag "]";
		public ParserRule getRule() { return rule; }

		//"[" startTag=RootTag "]" subTypes+=RootType* at+=Attributes* okpreproc+=Preprocessor* "[" "/" endTag=RootTag "]"
		public Group getGroup() { return cGroup; }

		//"["
		public Keyword getLeftSquareBracketKeyword_0() { return cLeftSquareBracketKeyword_0; }

		//startTag=RootTag
		public Assignment getStartTagAssignment_1() { return cStartTagAssignment_1; }

		//RootTag
		public RuleCall getStartTagRootTagParserRuleCall_1_0() { return cStartTagRootTagParserRuleCall_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_2() { return cRightSquareBracketKeyword_2; }

		//subTypes+=RootType*
		public Assignment getSubTypesAssignment_3() { return cSubTypesAssignment_3; }

		//RootType
		public RuleCall getSubTypesRootTypeParserRuleCall_3_0() { return cSubTypesRootTypeParserRuleCall_3_0; }

		//at+=Attributes*
		public Assignment getAtAssignment_4() { return cAtAssignment_4; }

		//Attributes
		public RuleCall getAtAttributesParserRuleCall_4_0() { return cAtAttributesParserRuleCall_4_0; }

		//okpreproc+=Preprocessor*
		public Assignment getOkpreprocAssignment_5() { return cOkpreprocAssignment_5; }

		//Preprocessor
		public RuleCall getOkpreprocPreprocessorParserRuleCall_5_0() { return cOkpreprocPreprocessorParserRuleCall_5_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_6() { return cLeftSquareBracketKeyword_6; }

		//"/"
		public Keyword getSolidusKeyword_7() { return cSolidusKeyword_7; }

		//endTag=RootTag
		public Assignment getEndTagAssignment_8() { return cEndTagAssignment_8; }

		//RootTag
		public RuleCall getEndTagRootTagParserRuleCall_8_0() { return cEndTagRootTagParserRuleCall_8_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_9() { return cRightSquareBracketKeyword_9; }
	}

	public class RootTagElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RootTag");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSimpleTagParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAddedTagParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//RootTag:
		//	SimpleTag | AddedTag;
		public ParserRule getRule() { return rule; }

		//SimpleTag | AddedTag
		public Alternatives getAlternatives() { return cAlternatives; }

		//SimpleTag
		public RuleCall getSimpleTagParserRuleCall_0() { return cSimpleTagParserRuleCall_0; }

		//AddedTag
		public RuleCall getAddedTagParserRuleCall_1() { return cAddedTagParserRuleCall_1; }
	}

	public class SimpleTagElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SimpleTag");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEndTagAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cEndTagSolidusKeyword_0_0 = (Keyword)cEndTagAssignment_0.eContents().get(0);
		private final Assignment cTagNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTagNameRootTagsListParserRuleCall_1_0 = (RuleCall)cTagNameAssignment_1.eContents().get(0);
		
		//SimpleTag:
		//	endTag?="/"? tagName=RootTagsList;
		public ParserRule getRule() { return rule; }

		//endTag?="/"? tagName=RootTagsList
		public Group getGroup() { return cGroup; }

		//endTag?="/"?
		public Assignment getEndTagAssignment_0() { return cEndTagAssignment_0; }

		//"/"
		public Keyword getEndTagSolidusKeyword_0_0() { return cEndTagSolidusKeyword_0_0; }

		//tagName=RootTagsList
		public Assignment getTagNameAssignment_1() { return cTagNameAssignment_1; }

		//RootTagsList
		public RuleCall getTagNameRootTagsListParserRuleCall_1_0() { return cTagNameRootTagsListParserRuleCall_1_0; }
	}

	public class AddedTagElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AddedTag");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPlusSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTagNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTagNameRootTagsListParserRuleCall_1_0 = (RuleCall)cTagNameAssignment_1.eContents().get(0);
		
		//AddedTag:
		//	"+" tagName=RootTagsList;
		public ParserRule getRule() { return rule; }

		//"+" tagName=RootTagsList
		public Group getGroup() { return cGroup; }

		//"+"
		public Keyword getPlusSignKeyword_0() { return cPlusSignKeyword_0; }

		//tagName=RootTagsList
		public Assignment getTagNameAssignment_1() { return cTagNameAssignment_1; }

		//RootTagsList
		public RuleCall getTagNameRootTagsListParserRuleCall_1_0() { return cTagNameRootTagsListParserRuleCall_1_0; }
	}

	public class RootTagsListElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RootTagsList");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		////'about'  | 'binary_path' | 'campaign' | 'textdomain' | 'units';
		//RootTagsList returns ecore::EString:
		//	ID;
		public ParserRule getRule() { return rule; }

		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}

	public class AttributesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Attributes");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAttrNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAttrNameIDTerminalRuleCall_0_0 = (RuleCall)cAttrNameAssignment_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAttrValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cAttrValueAlternatives_2_0 = (Alternatives)cAttrValueAssignment_2.eContents().get(0);
		private final RuleCall cAttrValueTSTRINGParserRuleCall_2_0_0 = (RuleCall)cAttrValueAlternatives_2_0.eContents().get(0);
		private final RuleCall cAttrValueSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cAttrValueAlternatives_2_0.eContents().get(1);
		private final RuleCall cAttrValuePATHTerminalRuleCall_2_0_2 = (RuleCall)cAttrValueAlternatives_2_0.eContents().get(2);
		private final RuleCall cAttrValueIDTerminalRuleCall_2_0_3 = (RuleCall)cAttrValueAlternatives_2_0.eContents().get(3);
		private final RuleCall cAttrValueIDLISTTerminalRuleCall_2_0_4 = (RuleCall)cAttrValueAlternatives_2_0.eContents().get(4);
		
		//Attributes:
		//	attrName=ID "=" attrValue=(TSTRING | STRING | PATH | ID | IDLIST);
		public ParserRule getRule() { return rule; }

		//attrName=ID "=" attrValue=(TSTRING | STRING | PATH | ID | IDLIST)
		public Group getGroup() { return cGroup; }

		//attrName=ID
		public Assignment getAttrNameAssignment_0() { return cAttrNameAssignment_0; }

		//ID
		public RuleCall getAttrNameIDTerminalRuleCall_0_0() { return cAttrNameIDTerminalRuleCall_0_0; }

		//"="
		public Keyword getEqualsSignKeyword_1() { return cEqualsSignKeyword_1; }

		//attrValue=(TSTRING | STRING | PATH | ID | IDLIST)
		public Assignment getAttrValueAssignment_2() { return cAttrValueAssignment_2; }

		//TSTRING | STRING | PATH | ID | IDLIST
		public Alternatives getAttrValueAlternatives_2_0() { return cAttrValueAlternatives_2_0; }

		//TSTRING
		public RuleCall getAttrValueTSTRINGParserRuleCall_2_0_0() { return cAttrValueTSTRINGParserRuleCall_2_0_0; }

		//STRING
		public RuleCall getAttrValueSTRINGTerminalRuleCall_2_0_1() { return cAttrValueSTRINGTerminalRuleCall_2_0_1; }

		//PATH
		public RuleCall getAttrValuePATHTerminalRuleCall_2_0_2() { return cAttrValuePATHTerminalRuleCall_2_0_2; }

		//ID
		public RuleCall getAttrValueIDTerminalRuleCall_2_0_3() { return cAttrValueIDTerminalRuleCall_2_0_3; }

		//IDLIST
		public RuleCall getAttrValueIDLISTTerminalRuleCall_2_0_4() { return cAttrValueIDLISTTerminalRuleCall_2_0_4; }
	}

	public class TSTRINGElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TSTRING");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword c_Keyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//// translatable string
		//TSTRING returns ecore::EString:
		//	"_" STRING;
		public ParserRule getRule() { return rule; }

		//"_" STRING
		public Group getGroup() { return cGroup; }

		//"_"
		public Keyword get_Keyword_0() { return c_Keyword_0; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1() { return cSTRINGTerminalRuleCall_1; }
	}

	public class HOMEPATHElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "HOMEPATH");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTildeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cPATHTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//HOMEPATH returns ecore::EString:
		//	"~" PATH;
		public ParserRule getRule() { return rule; }

		//"~" PATH
		public Group getGroup() { return cGroup; }

		//"~"
		public Keyword getTildeKeyword_0() { return cTildeKeyword_0; }

		//PATH
		public RuleCall getPATHTerminalRuleCall_1() { return cPATHTerminalRuleCall_1; }
	}
	
	
	private RootElements pRoot;
	private TextDomainElements pTextDomain;
	private PreprocessorElements pPreprocessor;
	private MacroElements pMacro;
	private PathIncludeElements pPathInclude;
	private RootTypeElements pRootType;
	private RootTagElements pRootTag;
	private SimpleTagElements pSimpleTag;
	private AddedTagElements pAddedTag;
	private RootTagsListElements pRootTagsList;
	private AttributesElements pAttributes;
	private TSTRINGElements pTSTRING;
	private HOMEPATHElements pHOMEPATH;
	private TerminalRule tSL_COMMENT;
	private TerminalRule tWS;
	private TerminalRule tID;
	private TerminalRule tIDLIST;
	private TerminalRule tSTRING;
	private TerminalRule tANY_OTHER;
	private TerminalRule tPATH;
	
	private final GrammarProvider grammarProvider;

	@Inject
	public WMLGrammarAccess(GrammarProvider grammarProvider) {
		this.grammarProvider = grammarProvider;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	
	//Root:
	//	textdomains+=TextDomain* preproc+=Preprocessor* roots+=RootType*;
	public RootElements getRootAccess() {
		return (pRoot != null) ? pRoot : (pRoot = new RootElements());
	}
	
	public ParserRule getRootRule() {
		return getRootAccess().getRule();
	}

	//TextDomain:
	//	"#textdomain " DomainName=ID;
	public TextDomainElements getTextDomainAccess() {
		return (pTextDomain != null) ? pTextDomain : (pTextDomain = new TextDomainElements());
	}
	
	public ParserRule getTextDomainRule() {
		return getTextDomainAccess().getRule();
	}

	//Preprocessor:
	//	Macro | PathInclude;
	public PreprocessorElements getPreprocessorAccess() {
		return (pPreprocessor != null) ? pPreprocessor : (pPreprocessor = new PreprocessorElements());
	}
	
	public ParserRule getPreprocessorRule() {
		return getPreprocessorAccess().getRule();
	}

	//Macro:
	//	"{" macroContent+=ID+ "}";
	public MacroElements getMacroAccess() {
		return (pMacro != null) ? pMacro : (pMacro = new MacroElements());
	}
	
	public ParserRule getMacroRule() {
		return getMacroAccess().getRule();
	}

	//PathInclude:
	//	"{" path=(HOMEPATH | PATH) "}";
	public PathIncludeElements getPathIncludeAccess() {
		return (pPathInclude != null) ? pPathInclude : (pPathInclude = new PathIncludeElements());
	}
	
	public ParserRule getPathIncludeRule() {
		return getPathIncludeAccess().getRule();
	}

	//RootType:
	//	"[" startTag=RootTag "]" subTypes+=RootType* at+=Attributes* okpreproc+=Preprocessor* "[" "/" endTag=RootTag "]";
	public RootTypeElements getRootTypeAccess() {
		return (pRootType != null) ? pRootType : (pRootType = new RootTypeElements());
	}
	
	public ParserRule getRootTypeRule() {
		return getRootTypeAccess().getRule();
	}

	//RootTag:
	//	SimpleTag | AddedTag;
	public RootTagElements getRootTagAccess() {
		return (pRootTag != null) ? pRootTag : (pRootTag = new RootTagElements());
	}
	
	public ParserRule getRootTagRule() {
		return getRootTagAccess().getRule();
	}

	//SimpleTag:
	//	endTag?="/"? tagName=RootTagsList;
	public SimpleTagElements getSimpleTagAccess() {
		return (pSimpleTag != null) ? pSimpleTag : (pSimpleTag = new SimpleTagElements());
	}
	
	public ParserRule getSimpleTagRule() {
		return getSimpleTagAccess().getRule();
	}

	//AddedTag:
	//	"+" tagName=RootTagsList;
	public AddedTagElements getAddedTagAccess() {
		return (pAddedTag != null) ? pAddedTag : (pAddedTag = new AddedTagElements());
	}
	
	public ParserRule getAddedTagRule() {
		return getAddedTagAccess().getRule();
	}

	////'about'  | 'binary_path' | 'campaign' | 'textdomain' | 'units';
	//RootTagsList returns ecore::EString:
	//	ID;
	public RootTagsListElements getRootTagsListAccess() {
		return (pRootTagsList != null) ? pRootTagsList : (pRootTagsList = new RootTagsListElements());
	}
	
	public ParserRule getRootTagsListRule() {
		return getRootTagsListAccess().getRule();
	}

	//Attributes:
	//	attrName=ID "=" attrValue=(TSTRING | STRING | PATH | ID | IDLIST);
	public AttributesElements getAttributesAccess() {
		return (pAttributes != null) ? pAttributes : (pAttributes = new AttributesElements());
	}
	
	public ParserRule getAttributesRule() {
		return getAttributesAccess().getRule();
	}

	//// translatable string
	//TSTRING returns ecore::EString:
	//	"_" STRING;
	public TSTRINGElements getTSTRINGAccess() {
		return (pTSTRING != null) ? pTSTRING : (pTSTRING = new TSTRINGElements());
	}
	
	public ParserRule getTSTRINGRule() {
		return getTSTRINGAccess().getRule();
	}

	//HOMEPATH returns ecore::EString:
	//	"~" PATH;
	public HOMEPATHElements getHOMEPATHAccess() {
		return (pHOMEPATH != null) ? pHOMEPATH : (pHOMEPATH = new HOMEPATHElements());
	}
	
	public ParserRule getHOMEPATHRule() {
		return getHOMEPATHAccess().getRule();
	}

	//// ==== TERMINAL RULES ====
	//terminal SL_COMMENT:
	//	"#" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return (tSL_COMMENT != null) ? tSL_COMMENT : (tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SL_COMMENT"));
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return (tWS != null) ? tWS : (tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS"));
	} 

	//// no multiline comment defined on WML, 
	//// terminal ML_COMMENT: '#' !('\n'|'\r')* ('\r'? '\n')?;
	//terminal ID:
	//	("a".."z" | "A".."Z" | "_" | "-" | " " | "0".."9")+;
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	} 

	//terminal IDLIST:
	//	(ID ",")* ID;
	public TerminalRule getIDLISTRule() {
		return (tIDLIST != null) ? tIDLIST : (tIDLIST = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "IDLIST"));
	} 

	////terminal INT returns ecore::EInt: ('0'..'9')+;
	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" | "n" |
	//	"f" | "r" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return (tSTRING != null) ? tSTRING : (tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "STRING"));
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return (tANY_OTHER != null) ? tANY_OTHER : (tANY_OTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ANY_OTHER"));
	} 

	////terminal WORD_START: ' ' | '=';
	////terminal WORD_END	: '#' | ' ';
	//// line end
	////('"')? 
	////('"')?
	//terminal PATH:
	//	(("a".."z" | "A".."Z" | "_" | "." | "-" | "0".."9")+ "/")* ("a".."z" | "A".."Z" | "_" | "." | "-" | "0".."9")+ "/"?;
	public TerminalRule getPATHRule() {
		return (tPATH != null) ? tPATH : (tPATH = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "PATH"));
	} 
}
