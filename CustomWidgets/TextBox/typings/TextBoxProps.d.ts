/**
 * This file was generated from TextBox.xml
 * WARNING: All changes made to this file will be overwritten
 * @author Mendix Widgets Team
 */
import { CSSProperties } from "react";
import { EditableValue } from "@mendix/pluggable-widgets-api/properties";

interface CommonProps {
    id: string;
    class: string;
    style?: CSSProperties;
    tabIndex: number;
}

export interface TextBoxContainerProps extends CommonProps {
    textAttribute: EditableValue<string>;
}

export interface TextBoxPreviewProps extends CommonProps {
    textAttribute: string;
}

export interface VisibilityMap {
    textAttribute: boolean;
}
